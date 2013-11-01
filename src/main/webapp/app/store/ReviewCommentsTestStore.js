Ext.define('RevCommunity.store.ReviewCommentsTestStore', {
extend:'Ext.data.Store',
    fields:['username', 'comment', 'date'],
    data:[
        { username: "Michael", comment: "Nulla ac elit viverra, viverra lacus eu, aliquet ligula.", date: '09-05-2007' },
        { username: "Dwight", comment: "Blandit vel id est. Vestibulum malesuada fringilla congue.", date: '24-05-2008' },
        { username: "Jim", comment: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ", date: '01-06-2012' },
        { username: "Kevin", comment: "Blandit vel id est. Vestibulum malesuada fringilla congue.", date: '02-06-2009' },
        { username: "Angela", comment: " Cras eget co nec bibendum scelerisque. ", date: '02-06-2013' }
    ]
});