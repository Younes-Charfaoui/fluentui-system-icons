package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowUpExclamation24: ImageVector
  get() {
    if (_arrowUpExclamation24 != null) {
      return _arrowUpExclamation24!!
    }
    _arrowUpExclamation24 = fluentIcon(name = "Filled.ArrowUpExclamation24", 24f) {
      materialPath {
          moveTo(18.0F, 4.56F)
          verticalLineToRelative(16.69F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(4.56F)
          lineToRelative(-2.22F, 2.22F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(3.5F, -3.5F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          lineToRelative(3.5F, 3.5F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          lineTo(18.0F, 4.56F)
          close()
          moveTo(3.125F, 5.878F)
          curveToRelative(0.0F, -2.14F, 1.735F, -3.875F, 3.875F, -3.875F)
          curveToRelative(2.14F, 0.0F, 3.876F, 1.735F, 3.876F, 3.875F)
          curveToRelative(0.0F, 2.95F, -1.205F, 6.564F, -1.811F, 8.204F)
          curveToRelative(-0.324F, 0.876F, -1.16F, 1.418F, -2.062F, 1.418F)
          curveToRelative(-0.906F, 0.0F, -1.742F, -0.545F, -2.065F, -1.423F)
          curveToRelative(-0.606F, -1.647F, -1.813F, -5.28F, -1.813F, -8.199F)
          close()
          moveTo(4.5F, 19.502F)
          curveToRelative(0.0F, -1.381F, 1.12F, -2.501F, 2.501F, -2.501F)
          curveToRelative(1.381F, 0.0F, 2.501F, 1.12F, 2.501F, 2.501F)
          curveToRelative(0.0F, 1.381F, -1.12F, 2.501F, -2.5F, 2.501F)
          curveToRelative(-1.382F, 0.0F, -2.502F, -1.12F, -2.502F, -2.5F)
          close()        
      }
    }
    return _arrowUpExclamation24!!
  }

private var _arrowUpExclamation24: ImageVector? = null
