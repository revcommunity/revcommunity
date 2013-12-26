package org.revcommunity.util.newsletter;

import java.util.List;

import org.revcommunity.model.Product;
import org.revcommunity.model.Review;

public class NewsletterDefault
    implements NewsletterMessage
{

    public String createMessage( List<Product> products, List<Review> reviews )
    {
        String temp = "";
        // TODO link do hosta dodac
        String url = "http://localhost:8080/revcommunity/";

        temp += "<div style='text-align:center; width:100%; color:#126ea4; font-size: 22px; margin-top:10px;;'>Lista najnowszych produktów</div>";

        for ( Product product : products )
        {
            // TODO link do hosta dodac

            temp += "<div style='width: 44%; margin: 2%; border: 1px solid #ddd; float:left;'>";
            temp += "<div style='float: left; width: 20%;'>";
            // TODO link do obrazków
            temp += "<a href='" + url + "#products/" + product.getNodeId() + "'>";
            temp += "<img src='http://mrw.blox.pl/resource/photo_not_available.jpg' style=' width: 100%;' />";
            temp += "</a>";
            temp += "</div>";
            temp += "<div style='height: 80px; width: 76%; float: left; padding: 2%; line-height: 24px;'>";
            temp +=
                "<a style='color:#126ea4; text-decoration:none;' href='" + url + "#products/" + product.getNodeId() + "'>" + product.getName()
                    + "</a><br />";
            temp += product.getProducer();
            temp += "</div>";
            temp += "</div>";
        }

        temp +=
            "<div style='float: left; text-align:center; width:100%; color:#126ea4; font-size: 22px; margin-top:30px;;'>Lista najnowszych recenzji</div>";
        for ( Review review : reviews )
        {
            temp += "<div style='width: 44%; margin: 2%; border: 1px solid #ddd; float:left;'>";
            temp += "<div style='float: left; width: 20%;'>";
            // TODO link do obrazków
            temp += "<a href='" + url + "#reviews/" + review.getNodeId() + "'>";
            temp += "<img style='width: 100%' src='http://mrw.blox.pl/resource/photo_not_available.jpg' />";
            temp += "</a>";
            temp += "</div>";
            temp += "<div style='height: 80px; width: 76%; float: left; padding: 2%; line-height: 24px;'>";
            temp +=
                "<a style='color:#126ea4; text-decoration:none;' href='" + url + "#products/" + review.getNodeId() + "'>" + review.getTitle()
                    + "</a><br />";
            temp +=
                "Dla produktu: " + "<a style='color:#126ea4; text-decoration:none;' href='" + url + "#products/" + review.getProduct().getNodeId()
                    + "'>";
            temp += review.getProduct().getName();
            temp += "</a>";
            temp += "</div>";
            temp += "</div>";
        }
        return temp;
    }

}
