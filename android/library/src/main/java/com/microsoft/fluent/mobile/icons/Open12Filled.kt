package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Open12: ImageVector
  get() {
    if (_open12 != null) {
      return _open12!!
    }
    _open12 = fluentIcon(name = "Filled.Open12", 12f) {
      materialPath {
          moveTo(4.0F, 3.5F)
          curveTo(3.724F, 3.5F, 3.5F, 3.724F, 3.5F, 4.0F)
          verticalLineToRelative(4.0F)
          curveToRelative(0.0F, 0.276F, 0.224F, 0.5F, 0.5F, 0.5F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(7.75F)
          curveTo(8.5F, 7.336F, 8.836F, 7.0F, 9.25F, 7.0F)
          reflectiveCurveTo(10.0F, 7.336F, 10.0F, 7.75F)
          verticalLineTo(8.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(4.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(0.25F)
          curveTo(4.664F, 2.0F, 5.0F, 2.336F, 5.0F, 2.75F)
          reflectiveCurveTo(4.664F, 3.5F, 4.25F, 3.5F)
          horizontalLineTo(4.0F)
          close()
          moveToRelative(2.75F, 0.0F)
          curveTo(6.336F, 3.5F, 6.0F, 3.164F, 6.0F, 2.75F)
          reflectiveCurveTo(6.336F, 2.0F, 6.75F, 2.0F)
          horizontalLineToRelative(2.5F)
          curveTo(9.664F, 2.0F, 10.0F, 2.336F, 10.0F, 2.75F)
          verticalLineToRelative(2.5F)
          curveTo(10.0F, 5.664F, 9.664F, 6.0F, 9.25F, 6.0F)
          reflectiveCurveTo(8.5F, 5.664F, 8.5F, 5.25F)
          verticalLineTo(4.56F)
          lineTo(7.28F, 5.78F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(7.44F, 3.5F)
          horizontalLineTo(6.75F)
          close()        
      }
    }
    return _open12!!
  }

private var _open12: ImageVector? = null
