package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.StreetSign24: ImageVector
  get() {
    if (_streetSign24 != null) {
      return _streetSign24!!
    }
    _streetSign24 = fluentIcon(name = "Filled.StreetSign24", 24f) {
      materialPath {
          moveTo(8.0F, 4.5F)
          curveTo(8.0F, 3.12F, 9.12F, 2.0F, 10.5F, 2.0F)
          reflectiveCurveTo(13.0F, 3.12F, 13.0F, 4.5F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(3.379F)
          curveToRelative(0.596F, 0.0F, 1.169F, 0.237F, 1.59F, 0.659F)
          lineToRelative(2.811F, 2.81F)
          curveToRelative(0.293F, 0.294F, 0.293F, 0.768F, 0.0F, 1.061F)
          lineToRelative(-2.81F, 2.811F)
          curveTo(17.548F, 13.763F, 16.975F, 14.0F, 16.379F, 14.0F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(6.75F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineToRelative(-2.5F)
          curveTo(8.56F, 22.0F, 8.0F, 21.44F, 8.0F, 20.75F)
          verticalLineTo(14.0F)
          horizontalLineTo(5.25F)
          curveTo(4.007F, 14.0F, 3.0F, 12.993F, 3.0F, 11.75F)
          verticalLineToRelative(-3.5F)
          curveTo(3.0F, 7.007F, 4.007F, 6.0F, 5.25F, 6.0F)
          horizontalLineTo(8.0F)
          verticalLineTo(4.5F)
          close()
          moveToRelative(3.5F, 0.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveToRelative(-1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineTo(6.0F)
          horizontalLineToRelative(2.0F)
          verticalLineTo(4.5F)
          close()
          moveToRelative(-2.0F, 16.0F)
          horizontalLineToRelative(2.0F)
          verticalLineTo(14.0F)
          horizontalLineToRelative(-2.0F)
          verticalLineToRelative(6.5F)
          close()        
      }
    }
    return _streetSign24!!
  }

private var _streetSign24: ImageVector? = null
