Ext.define('RevCommunity.store.ReviewEvaluationTestStore', {
extend:'Ext.data.Store',
    fields:['key', 'value'],
    data:[
        { key: "szybkość", value: "5"},
        { key: "wygoda", value: "2"},
        { key: "dźwięk", value: "4"},
        { key: "wyświetlacz", value: "3"}
    ]
});