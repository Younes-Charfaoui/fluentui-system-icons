package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ImageBorder24: ImageVector
  get() {
    if (_imageBorder24 != null) {
      return _imageBorder24!!
    }
    _imageBorder24 = fluentIcon(name = "Regular.ImageBorder24", 24f) {
      materialPath {
          moveTo(14.0F, 9.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          reflectiveCurveToRelative(1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          close()
          moveTo(7.25F, 6.5F)
          curveTo(6.836F, 6.5F, 6.5F, 6.836F, 6.5F, 7.25F)
          verticalLineToRelative(9.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(9.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-9.5F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-9.5F)
          close()
          moveToRelative(3.159F, 6.159F)
          lineTo(8.0F, 15.068F)
          verticalLineTo(8.0F)
          horizontalLineToRelative(8.0F)
          verticalLineToRelative(7.068F)
          lineToRelative(-2.409F, -2.409F)
          curveToRelative(-0.879F, -0.879F, -2.303F, -0.879F, -3.182F, 0.0F)
          close()
          moveToRelative(2.121F, 1.06F)
          lineTo(14.81F, 16.0F)
          horizontalLineTo(9.19F)
          lineToRelative(2.28F, -2.28F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          close()
          moveTo(6.25F, 3.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveTo(3.0F, 19.545F, 4.455F, 21.0F, 6.25F, 21.0F)
          horizontalLineToRelative(11.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(6.25F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineTo(6.25F)
          close()
          moveTo(4.5F, 6.25F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineToRelative(11.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, 0.784F, 1.75F, 1.75F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineTo(6.25F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineTo(6.25F)
          close()        
      }
    }
    return _imageBorder24!!
  }

private var _imageBorder24: ImageVector? = null
