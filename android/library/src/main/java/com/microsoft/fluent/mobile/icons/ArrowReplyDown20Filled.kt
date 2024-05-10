package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowReplyDown20: ImageVector
  get() {
    if (_arrowReplyDown20 != null) {
      return _arrowReplyDown20!!
    }
    _arrowReplyDown20 = fluentIcon(name = "Filled.ArrowReplyDown20", 20f) {
      materialPath {
          moveTo(17.25F, 4.0F)
          curveTo(17.664F, 4.0F, 18.0F, 4.336F, 18.0F, 4.75F)
          curveTo(18.0F, 8.754F, 14.754F, 12.0F, 10.75F, 12.0F)
          horizontalLineTo(4.56F)
          lineToRelative(3.22F, 3.22F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          lineToRelative(-4.5F, -4.5F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(4.5F, -4.5F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          lineTo(4.56F, 10.5F)
          horizontalLineToRelative(6.19F)
          curveToRelative(3.176F, 0.0F, 5.75F, -2.574F, 5.75F, -5.75F)
          curveTo(16.5F, 4.336F, 16.836F, 4.0F, 17.25F, 4.0F)
          close()        
      }
    }
    return _arrowReplyDown20!!
  }

private var _arrowReplyDown20: ImageVector? = null
