package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowReplyDown16: ImageVector
  get() {
    if (_arrowReplyDown16 != null) {
      return _arrowReplyDown16!!
    }
    _arrowReplyDown16 = fluentIcon(name = "Filled.ArrowReplyDown16", 16f) {
      materialPath {
          moveTo(4.56F, 8.0F)
          lineToRelative(2.22F, -2.22F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-3.5F, 3.5F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(3.5F, 3.5F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(4.56F, 9.5F)
          horizontalLineToRelative(3.69F)
          curveTo(11.426F, 9.5F, 14.0F, 6.926F, 14.0F, 3.75F)
          curveTo(14.0F, 3.336F, 13.664F, 3.0F, 13.25F, 3.0F)
          reflectiveCurveTo(12.5F, 3.336F, 12.5F, 3.75F)
          curveTo(12.5F, 6.097F, 10.597F, 8.0F, 8.25F, 8.0F)
          horizontalLineTo(4.56F)
          close()        
      }
    }
    return _arrowReplyDown16!!
  }

private var _arrowReplyDown16: ImageVector? = null
