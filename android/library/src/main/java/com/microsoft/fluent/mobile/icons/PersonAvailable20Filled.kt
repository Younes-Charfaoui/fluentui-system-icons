package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonAvailable20: ImageVector
  get() {
    if (_personAvailable20 != null) {
      return _personAvailable20!!
    }
    _personAvailable20 = fluentIcon(name = "Filled.PersonAvailable20", 20f) {
      materialPath {
          moveTo(5.0F, 6.0F)
          curveToRelative(0.0F, -2.21F, 1.79F, -4.0F, 4.0F, -4.0F)
          reflectiveCurveToRelative(4.0F, 1.79F, 4.0F, 4.0F)
          reflectiveCurveToRelative(-1.79F, 4.0F, -4.0F, 4.0F)
          reflectiveCurveToRelative(-4.0F, -1.79F, -4.0F, -4.0F)
          close()
          moveToRelative(-3.0F, 7.0F)
          curveToRelative(0.0F, -1.113F, 0.903F, -2.0F, 2.009F, -2.0F)
          horizontalLineToRelative(6.248F)
          curveTo(9.472F, 11.95F, 9.0F, 13.17F, 9.0F, 14.5F)
          curveToRelative(0.0F, 1.303F, 0.453F, 2.5F, 1.21F, 3.443F)
          curveTo(9.816F, 17.98F, 9.41F, 18.0F, 9.0F, 18.0F)
          curveToRelative(-1.855F, 0.0F, -3.583F, -0.386F, -4.865F, -1.203F)
          curveTo(2.833F, 15.967F, 2.0F, 14.69F, 2.0F, 13.0F)
          close()
          moveToRelative(17.0F, 1.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          reflectiveCurveTo(10.0F, 16.985F, 10.0F, 14.5F)
          reflectiveCurveToRelative(2.015F, -4.5F, 4.5F, -4.5F)
          reflectiveCurveToRelative(4.5F, 2.015F, 4.5F, 4.5F)
          close()
          moveToRelative(-2.146F, -1.854F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          lineTo(13.5F, 15.293F)
          lineToRelative(-0.646F, -0.647F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineToRelative(1.0F, 1.0F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineToRelative(3.0F, -3.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          close()        
      }
    }
    return _personAvailable20!!
  }

private var _personAvailable20: ImageVector? = null