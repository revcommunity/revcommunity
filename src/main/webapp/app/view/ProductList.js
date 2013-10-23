Ext.define('RevCommunity.view.ProductList', {
		    title: 'Lista produktów',
		    extend:'Ext.grid.Panel',
		    xtype:'productlist',
		    viewConfig:{
		    	disableSelection:true,
		    	 overItemCls:'',
		    	 enableTextSelection: true
		    },
		    hideHeaders:true,
		    store: 'ProductStore',
		    buildTpl:function(){
		    	
		    	return new Ext.XTemplate('<div class="rev-list-header"><span>{name}</span></div>',
		    			'<div class="rev-col-wrap">',
		    			'<img src="{mainImage}" class="rev-img-small rev-col" ></img>',
		    			'<div class="rev-border rev-container">',
		    					'<p>Producent: {producer}</p>',
		    					'<p>Kod produktu: {productCode}</p>',
		    			'</div>',
		    			'<div class="rev-border rev-container-fit">{description}</div>',
		    			'</div>',
		    			'<div class="rev-list-links">',
		    				'<div class="rev-box">Cena: 100 zł{price}</div>',
		    				'<div class="rev-box">Średnia ocena: 4.5{rating}</div>',
		    				'<div class="rev-box rev-box-button" action="review">Recenzje</div>',
		    				'<div class="rev-box rev-box-button" action="details">Szczegóły</div>',
		    				'<div class="rev-box rev-box-button" action="addReview">Dodaj recenzję dla tego produktu</div>',
		    			'</div>'
		    	);
		    },
		    initComponent:function(){
		    	this.columns=[
			        {  
			        	xtype: 'templatecolumn', 
			       		flex:1,
			       		tpl:   this.buildTpl()//'<p> {name} {id} {description} {mainImage}</p>'
			       	}
			    ]
			    this.callParent(arguments);
		    }
});
