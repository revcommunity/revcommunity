Ext.define('RevCommunity.view.components.SortDirection' ,{
	extend: 'Ext.Button',
    alias: 'widget.sortdirection',
    direction:'DESC',
    text:'',
    icon : "img/desc.png",
    swap:function(){
    	icon = "";
    	if(this.direction=='ASC'){
    		this.direction='DESC';
    		icon = 'img/desc.png';
    	}else{
    		this.direction='ASC';
    		icon = 'img/asc.png';
    	}
    	this.setIcon(icon);
    }
});
