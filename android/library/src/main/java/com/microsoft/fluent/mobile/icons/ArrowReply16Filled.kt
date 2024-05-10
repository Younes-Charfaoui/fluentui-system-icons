package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowReply16: ImageVector
  get() {
    if (_arrowReply16 != null) {
      return _arrowReply16!!
    }
    _arrowReply16 = fluentIcon(name = "Filled.ArrowReply16", 16f) {
      materialPath {
          moveTo(6.78F, 4.28F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-3.5F, 3.5F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(3.5F, 3.5F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(4.56F, 8.0F)
          horizontalLineToRelative(3.69F)
          curveToRelative(2.347F, 0.0F, 4.25F, 1.903F, 4.25F, 4.25F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveTo(14.0F, 12.664F, 14.0F, 12.25F)
          curveToRelative(0.0F, -3.176F, -2.574F, -5.75F, -5.75F, -5.75F)
          horizontalLineTo(4.56F)
          lineToRelative(2.22F, -2.22F)
          close()        
      }
    }
    return _arrowReply16!!
  }

private var _arrowReply16: ImageVector? = null
