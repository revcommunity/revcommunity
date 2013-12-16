Ext.define('RevCommunity.store.CommentStore', {
	extend:'Ext.data.Store',
	model:'RevCommunity.model.Comment',
    proxy: {
        type: 'rest',
    },
    setReviewNodeId:function(reviewNodeId){
    	this.proxy.url="rest/comments/reviewComments/"+reviewNodeId;
    },
	sorters : [ {
		property : 'dateAdded',
		direction : 'DESC',
	} ],
});