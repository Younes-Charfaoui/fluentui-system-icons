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
          moveTo(10.28F, 6.28F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-6.0F, 6.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(6.0F, 6.0F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(5.56F, 12.5F)
          horizontalLineToRelative(9.19F)
          curveToRelative(4.832F, 0.0F, 8.75F, 3.918F, 8.75F, 8.75F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveTo(25.0F, 21.664F, 25.0F, 21.25F)
          curveTo(25.0F, 15.59F, 20.41F, 11.0F, 14.75F, 11.0F)
          horizontalLineTo(5.56F)
          lineToRelative(4.72F, -4.72F)
          close()        
      }
    }
    return _arrowReply28!!
  }

private var _arrowReply28: ImageVector? = null
