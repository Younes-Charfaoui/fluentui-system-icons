package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowReply24: ImageVector
  get() {
    if (_arrowReply24 != null) {
      return _arrowReply24!!
    }
    _arrowReply24 = fluentIcon(name = "Regular.ArrowReply24", 24f) {
      materialPath {
          moveTo(9.28F, 6.28F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-5.0F, 5.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(5.0F, 5.0F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(5.56F, 11.5F)
          horizontalLineToRelative(7.69F)
          curveToRelative(3.452F, 0.0F, 6.25F, 2.798F, 6.25F, 6.25F)
          verticalLineToRelative(0.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveTo(21.0F, 18.664F, 21.0F, 18.25F)
          verticalLineToRelative(-0.5F)
          curveToRelative(0.0F, -4.28F, -3.47F, -7.75F, -7.75F, -7.75F)
          horizontalLineTo(5.56F)
          lineToRelative(3.72F, -3.72F)
          close()        
      }
    }
    return _arrowReply24!!
  }

private var _arrowReply24: ImageVector? = null
