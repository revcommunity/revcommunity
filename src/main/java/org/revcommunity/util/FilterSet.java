package org.revcommunity.util;

import java.util.HashSet;
import java.util.Iterator;

import org.revcommunity.model.CategoryFilter;

public class FilterSet<CategoryFilter> extends HashSet<CategoryFilter>
{

   /**
     * 
     */
    private static final long serialVersionUID = 1L;

@Override
   public boolean contains( Object o )
   {
       CategoryFilter cf = (CategoryFilter)o;
       
       Iterator<CategoryFilter> it = this.iterator();
       
       
       
       while(it.hasNext()){
           CategoryFilter c = (CategoryFilter)it.next();
           if( c != null && 
                           ( (org.revcommunity.model.CategoryFilter) c ).getName().equals( ( (org.revcommunity.model.CategoryFilter) cf ).getName() ) ){
               
               return true;
           }
       }
       
       return false;
    }
}
