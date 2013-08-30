package org.revcommunity.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService
{
    private static final Logger log = Logger.getLogger( ImageService.class.getName() );

    public static final String imgDirName = "img";

    public static final String emptyImgPath = "img/empty.jpg";

    @Autowired
    private ServletContext servletContext;

    public List<File> save( List<MultipartFile> images )
    {
        File dir = new File( servletContext.getRealPath( "/" ) + File.separator + imgDirName );
        List<File> savedFiles = new ArrayList<File>();
        for ( MultipartFile img : images )
        {
            if ( img.isEmpty() )
                continue;

            log.debug( "Image orginal name: " + img.getOriginalFilename() );
            log.debug( "Image content type: " + img.getContentType() );
            File file;
            try
            {
                file = File.createTempFile( "img", img.getOriginalFilename(), dir );
                log.debug( "Plik został utworzyony: " + file.getAbsolutePath() );
                FileOutputStream fos = new FileOutputStream( file );
                IOUtils.copy( img.getInputStream(), fos );
                fos.close();
                savedFiles.add( file );

            }
            catch ( IOException e )
            {
                log.error( "Nie udało się zapisać pliku na dysku w katalogu: " + dir.getAbsolutePath(), e );
            }

        }
        return savedFiles;
    }
}
