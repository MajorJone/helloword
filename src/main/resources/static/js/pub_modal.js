/**
 * 公用js处理bootstrap弹出窗口不居中。
 */
$(function() {
    var $modal = $('.modal');
    $modal.on('shown.bs.modal', function () {
        var $this = $(this);
        var $modal_dialog = $this.find('.modal-dialog');
        var m_top = ( $(window).height() - $modal_dialog.height() ) / 2;
        $modal_dialog.css({'margin': m_top + 'px auto'});

        // $this.$element.children().eq(0).css("position", "absolute").css({
        //     "margin": "0px",
        //     "top": function () {
        //         return ($this.$element.height() - $this.$element.children().eq(0).height() - 40) / 2 + "px";
        //     },
        //     "left": function () {
        //         return ($this.$element.width() - $this.$element.children().eq(0).width()) / 2 + "px";
        //     }
        // });

    });
});