package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowReply28: ImageVector
  get() {
    if (_arrowReply28 != null) {
      return _arrowReply28!!
    }
    _arrowReply28 = fluentIcon(name = "Regular.ArrowReply28", 28f) {
      materialPath {
          moveTo(10.03F, 5.47F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          lineTo(5.56F, 11.0F)
          horizontalLineToRelative(8.69F)
          curveTo(20.187F, 11.0F, 25.0F, 15.813F, 25.0F, 21.75F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          curveToRelative(0.0F, -5.109F, -4.141F, -9.25F, -9.25F, -9.25F)
          horizontalLineTo(5.56F)
          lineToRelative(4.47F, 4.47F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          lineToRelative(-5.75F, -5.75F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(5.75F, -5.75F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          close()        
      }
    }
    return _arrowReply28!!
  }

private var _arrowReply28: ImageVector? = null
