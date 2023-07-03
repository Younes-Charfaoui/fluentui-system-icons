package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PeopleCheckmark24: ImageVector
  get() {
    if (_peopleCheckmark24 != null) {
      return _peopleCheckmark24!!
    }
    _peopleCheckmark24 = fluentIcon(name = "Filled.PeopleCheckmark24", 24f) {
      materialPath {
          moveTo(8.0F, 11.0F)
          curveToRelative(2.21F, 0.0F, 4.0F, -1.79F, 4.0F, -4.0F)
          reflectiveCurveToRelative(-1.79F, -4.0F, -4.0F, -4.0F)
          reflectiveCurveToRelative(-4.0F, 1.79F, -4.0F, 4.0F)
          reflectiveCurveToRelative(1.79F, 4.0F, 4.0F, 4.0F)
          close()
          moveToRelative(9.0F, 0.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          reflectiveCurveToRelative(-1.343F, -3.0F, -3.0F, -3.0F)
          reflectiveCurveToRelative(-3.0F, 1.343F, -3.0F, 3.0F)
          reflectiveCurveToRelative(1.343F, 3.0F, 3.0F, 3.0F)
          close()
          moveTo(4.25F, 13.0F)
          curveTo(3.007F, 13.0F, 2.0F, 14.007F, 2.0F, 15.25F)
          verticalLineToRelative(0.25F)
          reflectiveCurveTo(2.0F, 20.0F, 8.0F, 20.0F)
          curveToRelative(1.39F, 0.0F, 2.458F, -0.241F, 3.278F, -0.613F)
          curveTo(11.098F, 18.79F, 11.0F, 18.157F, 11.0F, 17.5F)
          curveToRelative(0.0F, -1.657F, 0.62F, -3.169F, 1.64F, -4.317F)
          curveTo(12.367F, 13.065F, 12.066F, 13.0F, 11.75F, 13.0F)
          horizontalLineToRelative(-7.5F)
          close()
          moveTo(23.0F, 17.5F)
          curveToRelative(0.0F, 3.038F, -2.462F, 5.5F, -5.5F, 5.5F)
          reflectiveCurveTo(12.0F, 20.538F, 12.0F, 17.5F)
          reflectiveCurveToRelative(2.462F, -5.5F, 5.5F, -5.5F)
          reflectiveCurveToRelative(5.5F, 2.462F, 5.5F, 5.5F)
          close()
          moveToRelative(-2.854F, -2.354F)
          lineTo(16.5F, 18.793F)
          lineToRelative(-1.646F, -1.647F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineToRelative(2.0F, 2.0F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineToRelative(4.0F, -4.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          close()        
      }
    }
    return _peopleCheckmark24!!
  }

private var _peopleCheckmark24: ImageVector? = null
