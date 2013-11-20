package org.revcommunity.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.revcommunity.model.Product;
import org.revcommunity.service.SubscriptionService;
import org.revcommunity.util.ImageService;
import org.revcommunity.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.EndResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping( "/subscriptions" )
public class SubscriptionController
{

    private static final Logger log = Logger.getLogger( SubscriptionController.class );

    @Autowired
    private SubscriptionService ss;

    @RequestMapping( method = RequestMethod.POST )
    @ResponseBody
    public Message save( @RequestParam String product, @RequestParam ArrayList<MultipartFile> images )
        throws JsonParseException, JsonMappingException, IOException
    {
        return new Message();
    }

}
