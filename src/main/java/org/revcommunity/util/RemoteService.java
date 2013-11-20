package org.revcommunity.util;

import java.util.List;

import org.revcommunity.model.AbstractCategory;
import org.revcommunity.model.Category;
import org.revcommunity.model.CategoryGroup;
import org.springframework.transaction.annotation.Transactional;

public interface RemoteService
{

    @Transactional
    public void downloadAllCategories();
    
    /**
     * Metoda rekurencyjnie pobiera wszystkie podkategorie(schodzi do liscia) dla danej kateogorii, 
     * wszystkie kategorie zostaja automatycznie zapisane w bazie!
     * @param nokautParentId
     * @return Lista bezposrednich potomkow danej kategorii
     */
    @Transactional
    public List<AbstractCategory> downloadCategoriesByParentId( Long parentId );
    
    /**
     * Pobiera produkty z danej kategorii, podana kategoria musi być lisciem.
     * Pobrane produkty są automatycznie zapisywane w bazie
     * @param categoryId
     * @param limit
     * @return JSON z produkatmi
     */
    @Transactional
    public void downloadProductsByCategoryId( Category category, int limit );
    
    /**
     * Metoda pobiera główne kategorie i zapisuje je w bazie
     * @param id
     * @return Listę ientyfikatorów pobranych kategorii 
     */
    @Transactional
    public List<CategoryGroup> downloadMainCategories();
}
