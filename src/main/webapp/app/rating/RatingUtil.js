var idArray = [ "#rating-input-1-1", "#rating-input-1-2", "#rating-input-1-3",
		"#rating-input-1-4", "#rating-input-1-5" ];
var RatingUtil = {
	getChecked : function(widgetId) {
		var el = $('#' + widgetId + ' .rating-input:checked');
		if (el.length > 0) {
			var c = el.attr('id').slice(-1);
			return parseInt(c);
		}
		return 0;
	},
	setChecked : function(widgetId, value) {
		var intValue = Math.round(value);
		if (intValue >= 1 && intValue <= 5) {			
			this.clearWidget(widgetId);
			$('#' + widgetId).find('#' + widgetId + '-input-' + intValue).attr(
					'checked', 'checked');
		} else if (intValue == 0) {
			this.clearWidget(widgetId);
		}
	},
	clearWidget : function(widgetId) {
		$('#' + widgetId).children('[checked="checked"]').each(function() {
			$(this).removeAttr("checked");
		});
	},
	disableWidgets : function(widgetIds) {
		for ( var i = 0; i < widgetIds.length; i = i + 1) {
			$("#" + widgetIds[i] + " .rating-input").attr("disabled", true);
			$("#" + widgetIds[i]).removeClass("rating").addClass(
					"rating-disabled");
		}
	},
	addRatingLabel : function(widgetId, rating, count) {
		
		var counter = '';
		if (rating != '-') {
			counter = " (" + count + ")";
		}else{
			rating = "-";
		}
		var label = "<div class=\"ratingLabel\">Ocena: " + rating + counter
				+ " </div>";
		$('#' + widgetId).after(label);
	},
	getRatingWidget : function(widgetId, value, disabled) {
		var widgetClass = 'rating';
		if (disabled) {
			widgetClass = 'rating-disabled';
		}
		var b = jQuery('<div/>', {
			id : widgetId,
			class : widgetClass,
		});
		b.append(TemplateHolder.ratingWidget.html);
		b.children('[name="rating-input-1"]').each(function() {
			$(this).attr('name', widgetId);
		});
		var intValue = Math.round(value);
		if (intValue != null && intValue >= 1 && intValue <= 5) {
			b.find(idArray[intValue - 1]).attr('checked', 'checked');
		}
		for ( var i = 0; i < idArray.length; i++) {
			b.find(idArray[i]).attr('id', widgetId + '-input-' + (i + 1));
			b.find('[for="' + idArray[i].replace('#', '') + '"]').attr('for',
					widgetId + '-input-' + (i + 1));
		}
		if (disabled == true) {
			b.find('.rating-input').attr("disabled", true);
		}
		return b[0].outerHTML;
	}

};