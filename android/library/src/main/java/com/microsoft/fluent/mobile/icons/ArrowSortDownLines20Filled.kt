package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ArrowSortDownLines20: ImageVector
  get() {
    if (_arrowSortDownLines20 != null) {
      return _arrowSortDownLines20!!
    }
    _arrowSortDownLines20 = fluentIcon(name = "Filled.ArrowSortDownLines20", 20f) {
      materialPath {
          moveTo(15.0F, 2.75F)
          curveTo(15.0F, 2.336F, 14.664F, 2.0F, 14.25F, 2.0F)
          reflectiveCurveTo(13.5F, 2.336F, 13.5F, 2.75F)
          verticalLineToRelative(12.572F)
          lineToRelative(-1.447F, -1.579F)
          curveToRelative(-0.28F, -0.305F, -0.755F, -0.326F, -1.06F, -0.046F)
          curveToRelative(-0.305F, 0.28F, -0.326F, 0.755F, -0.046F, 1.06F)
          lineToRelative(2.75F, 3.0F)
          curveTo(13.84F, 17.912F, 14.04F, 18.0F, 14.25F, 18.0F)
          curveToRelative(0.21F, 0.0F, 0.41F, -0.088F, 0.553F, -0.243F)
          lineToRelative(2.75F, -3.0F)
          curveToRelative(0.28F, -0.306F, 0.26F, -0.78F, -0.046F, -1.06F)
          reflectiveCurveToRelative(-0.78F, -0.26F, -1.06F, 0.046F)
          lineTo(15.0F, 15.322F)
          verticalLineTo(2.75F)
          close()
          moveTo(2.75F, 3.5F)
          curveTo(2.336F, 3.5F, 2.0F, 3.836F, 2.0F, 4.25F)
          reflectiveCurveTo(2.336F, 5.0F, 2.75F, 5.0F)
          horizontalLineToRelative(8.5F)
          curveTo(11.664F, 5.0F, 12.0F, 4.664F, 12.0F, 4.25F)
          reflectiveCurveTo(11.664F, 3.5F, 11.25F, 3.5F)
          horizontalLineToRelative(-8.5F)
          close()
          moveTo(5.0F, 7.25F)
          curveTo(5.0F, 6.836F, 5.336F, 6.5F, 5.75F, 6.5F)
          horizontalLineToRelative(5.5F)
          curveTo(11.664F, 6.5F, 12.0F, 6.836F, 12.0F, 7.25F)
          reflectiveCurveTo(11.664F, 8.0F, 11.25F, 8.0F)
          horizontalLineToRelative(-5.5F)
          curveTo(5.336F, 8.0F, 5.0F, 7.664F, 5.0F, 7.25F)
          close()
          moveTo(8.75F, 9.5F)
          curveTo(8.336F, 9.5F, 8.0F, 9.836F, 8.0F, 10.25F)
          reflectiveCurveTo(8.336F, 11.0F, 8.75F, 11.0F)
          horizontalLineToRelative(2.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(11.664F, 9.5F, 11.25F, 9.5F)
          horizontalLineToRelative(-2.5F)
          close()        
      }
    }
    return _arrowSortDownLines20!!
  }

private var _arrowSortDownLines20: ImageVector? = null
