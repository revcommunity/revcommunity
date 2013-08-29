Ext.define('RevCommunity.store.ReviewStore', {
	extend:'Ext.data.Store',
    fields:['user', 'review', 'rank'],
    data:[
        { user: "Michael", review: "Nulla ac elit viverra, viverra lacus eu, aliquet ligula.",   rank: 3 },
        { user: "Dwight",  review: "Blandit vel id est. Vestibulum malesuada fringilla congue.", rank: 2 },
        { user: "Jim",     review: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ", rank: 3 },
        { user: "Kevin",   review: "Blandit vel id est. Vestibulum malesuada fringilla congue.",  rank: 4 },
        { user: "Angela",  review: "Vivamus at ipsum arcu. Cras vel nisl nibh. Cras eget commodo nibh. Donec placerat leo nec bibendum scelerisque. ",  rank: 5 }                        
    ]
});