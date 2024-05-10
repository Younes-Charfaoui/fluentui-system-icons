package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Compose12: ImageVector
  get() {
    if (_compose12 != null) {
      return _compose12!!
    }
    _compose12 = fluentIcon(name = "Filled.Compose12", 12f) {
      materialPath {
          moveTo(10.78F, 2.28F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineTo(5.44F, 5.5F)
          lineTo(5.0F, 7.0F)
          lineToRelative(1.5F, -0.44F)
          lineToRelative(4.28F, -4.28F)
          close()
          moveTo(6.25F, 1.5F)
          curveTo(6.664F, 1.5F, 7.0F, 1.836F, 7.0F, 2.25F)
          reflectiveCurveTo(6.664F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(-2.5F)
          curveTo(3.336F, 3.0F, 3.0F, 3.336F, 3.0F, 3.75F)
          verticalLineToRelative(4.5F)
          curveTo(3.0F, 8.664F, 3.336F, 9.0F, 3.75F, 9.0F)
          horizontalLineToRelative(4.5F)
          curveTo(8.664F, 9.0F, 9.0F, 8.664F, 9.0F, 8.25F)
          verticalLineToRelative(-2.5F)
          curveTo(9.0F, 5.336F, 9.336F, 5.0F, 9.75F, 5.0F)
          reflectiveCurveToRelative(0.75F, 0.336F, 0.75F, 0.75F)
          verticalLineToRelative(2.5F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineToRelative(-4.5F)
          curveToRelative(-1.243F, 0.0F, -2.25F, -1.007F, -2.25F, -2.25F)
          verticalLineToRelative(-4.5F)
          curveToRelative(0.0F, -1.243F, 1.007F, -2.25F, 2.25F, -2.25F)
          horizontalLineToRelative(2.5F)
          close()        
      }
    }
    return _compose12!!
  }

private var _compose12: ImageVector? = null
