Ext.define('RevCommunity.view.components.SortDirection' ,{
	extend: 'Ext.Button',
    alias: 'widget.sortdirection',
    direction:'DESC',
    text:'DESC',
    swap:function(){
    	if(this.direction=='ASC'){
    		this.direction='DESC';
    	}else{
    		this.direction='ASC';
    	}
    	this.setText(this.direction);
    }
});
