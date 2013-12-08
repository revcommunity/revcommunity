package org.revcommunity.dto;

import java.util.List;

import org.revcommunity.model.FilterValue;
import org.revcommunity.util.search.Sorter;

public class ProductFilterDto
{

    private Long categoryId;

    private List<FilterValue> filters;

    private List<Sorter> sort;

    private Integer start;

    private Integer limit;

    public Long getCategoryId()
    {
        return categoryId;
    }

    public void setCategoryId( Long categoryId )
    {
        this.categoryId = categoryId;
    }

    public List<FilterValue> getFilters()
    {
        return filters;
    }

    public void setFilters( List<FilterValue> filters )
    {
        this.filters = filters;
    }

    public List<Sorter> getSort()
    {
        return sort;
    }

    public void setSort( List<Sorter> sort )
    {
        this.sort = sort;
    }

    public Integer getStart()
    {
        return start;
    }

    public void setStart( Integer start )
    {
        this.start = start;
    }

    public Integer getLimit()
    {
        return limit;
    }

    public void setLimit( Integer limit )
    {
        this.limit = limit;
    }
}
