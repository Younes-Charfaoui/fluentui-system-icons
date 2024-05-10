package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowReply20: ImageVector
  get() {
    if (_arrowReply20 != null) {
      return _arrowReply20!!
    }
    _arrowReply20 = fluentIcon(name = "Filled.ArrowReply20", 20f) {
      materialPath {
          moveTo(7.78F, 4.78F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-4.5F, 4.5F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(4.5F, 4.5F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(4.56F, 9.5F)
          horizontalLineToRelative(6.19F)
          curveToRelative(3.176F, 0.0F, 5.75F, 2.574F, 5.75F, 5.75F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveTo(18.0F, 15.664F, 18.0F, 15.25F)
          curveTo(18.0F, 11.246F, 14.754F, 8.0F, 10.75F, 8.0F)
          horizontalLineTo(4.56F)
          lineToRelative(3.22F, -3.22F)
          close()        
      }
    }
    return _arrowReply20!!
  }

private var _arrowReply20: ImageVector? = null
