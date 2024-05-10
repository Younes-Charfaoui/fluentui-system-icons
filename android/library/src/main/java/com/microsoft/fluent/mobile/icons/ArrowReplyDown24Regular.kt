package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowReplyDown24: ImageVector
  get() {
    if (_arrowReplyDown24 != null) {
      return _arrowReplyDown24!!
    }
    _arrowReplyDown24 = fluentIcon(name = "Regular.ArrowReplyDown24", 24f) {
      materialPath {
          moveTo(20.25F, 5.0F)
          curveTo(20.664F, 5.0F, 21.0F, 5.336F, 21.0F, 5.75F)
          verticalLineToRelative(0.5F)
          curveToRelative(0.0F, 4.28F, -3.47F, 7.75F, -7.75F, 7.75F)
          horizontalLineTo(5.56F)
          lineToRelative(3.72F, 3.72F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          lineToRelative(-5.0F, -5.0F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(5.0F, -5.0F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          lineTo(5.56F, 12.5F)
          horizontalLineToRelative(7.69F)
          curveToRelative(3.452F, 0.0F, 6.25F, -2.798F, 6.25F, -6.25F)
          verticalLineToRelative(-0.5F)
          curveTo(19.5F, 5.336F, 19.836F, 5.0F, 20.25F, 5.0F)
          close()        
      }
    }
    return _arrowReplyDown24!!
  }

private var _arrowReplyDown24: ImageVector? = null
