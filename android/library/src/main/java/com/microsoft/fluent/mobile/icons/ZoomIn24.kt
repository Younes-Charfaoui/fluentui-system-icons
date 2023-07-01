package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ZoomIn24: ImageVector
  get() {
    if (_zoomIn24 != null) {
      return _zoomIn24!!
    }
    _zoomIn24 = fluentIcon(name = "Regular.ZoomIn24", 24f) {
      materialPath {
          moveTo(13.5F, 10.0F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-2.0F)
          verticalLineToRelative(-2.0F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          reflectiveCurveTo(9.25F, 6.836F, 9.25F, 7.25F)
          verticalLineToRelative(2.0F)
          horizontalLineToRelative(-2.0F)
          curveTo(6.836F, 9.25F, 6.5F, 9.586F, 6.5F, 10.0F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(2.0F)
          verticalLineToRelative(2.0F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-2.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          close()
          moveTo(10.0F, 2.75F)
          curveToRelative(4.004F, 0.0F, 7.25F, 3.246F, 7.25F, 7.25F)
          curveToRelative(0.0F, 1.732F, -0.607F, 3.322F, -1.62F, 4.569F)
          lineToRelative(4.9F, 4.9F)
          curveToRelative(0.293F, 0.294F, 0.293F, 0.768F, 0.0F, 1.061F)
          curveToRelative(-0.266F, 0.267F, -0.683F, 0.29F, -0.976F, 0.073F)
          lineTo(19.47F, 20.53F)
          lineToRelative(-4.901F, -4.9F)
          curveToRelative(-1.247F, 1.013F, -2.837F, 1.62F, -4.569F, 1.62F)
          curveToRelative(-4.004F, 0.0F, -7.25F, -3.246F, -7.25F, -7.25F)
          reflectiveCurveTo(5.996F, 2.75F, 10.0F, 2.75F)
          close()
          moveToRelative(0.0F, 1.5F)
          curveToRelative(-3.176F, 0.0F, -5.75F, 2.574F, -5.75F, 5.75F)
          reflectiveCurveToRelative(2.574F, 5.75F, 5.75F, 5.75F)
          reflectiveCurveToRelative(5.75F, -2.574F, 5.75F, -5.75F)
          reflectiveCurveTo(13.176F, 4.25F, 10.0F, 4.25F)
          close()        
      }
    }
    return _zoomIn24!!
  }

private var _zoomIn24: ImageVector? = null
