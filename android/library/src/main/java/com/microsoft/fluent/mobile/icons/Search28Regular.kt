package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Search28: ImageVector
  get() {
    if (_search28 != null) {
      return _search28!!
    }
    _search28 = fluentIcon(name = "Regular.Search28", 28f) {
      materialPath {
          moveTo(4.5F, 11.5F)
          curveToRelative(0.0F, -3.866F, 3.134F, -7.0F, 7.0F, -7.0F)
          reflectiveCurveToRelative(7.0F, 3.134F, 7.0F, 7.0F)
          reflectiveCurveToRelative(-3.134F, 7.0F, -7.0F, 7.0F)
          reflectiveCurveToRelative(-7.0F, -3.134F, -7.0F, -7.0F)
          close()
          moveToRelative(7.0F, -8.5F)
          curveTo(6.806F, 3.0F, 3.0F, 6.806F, 3.0F, 11.5F)
          reflectiveCurveTo(6.806F, 20.0F, 11.5F, 20.0F)
          curveToRelative(2.077F, 0.0F, 3.98F, -0.745F, 5.457F, -1.983F)
          lineToRelative(6.763F, 6.763F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(-6.763F, -6.763F)
          curveTo(19.255F, 15.48F, 20.0F, 13.577F, 20.0F, 11.5F)
          curveTo(20.0F, 6.806F, 16.194F, 3.0F, 11.5F, 3.0F)
          close()        
      }
    }
    return _search28!!
  }

private var _search28: ImageVector? = null
