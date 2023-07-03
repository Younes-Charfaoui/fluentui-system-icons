package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Cube16: ImageVector
  get() {
    if (_cube16 != null) {
      return _cube16!!
    }
    _cube16 = fluentIcon(name = "Filled.Cube16", 16f) {
      materialPath {
          moveTo(6.923F, 1.378F)
          curveToRelative(0.693F, -0.267F, 1.46F, -0.267F, 2.154F, 0.0F)
          lineToRelative(4.962F, 1.908F)
          curveTo(14.618F, 3.509F, 15.0F, 4.066F, 15.0F, 4.686F)
          verticalLineToRelative(6.626F)
          curveToRelative(0.0F, 0.621F, -0.382F, 1.178F, -0.961F, 1.4F)
          lineToRelative(-4.962F, 1.909F)
          curveToRelative(-0.693F, 0.266F, -1.46F, 0.266F, -2.154F, 0.0F)
          lineToRelative(-4.962F, -1.909F)
          curveTo(1.383F, 12.49F, 1.0F, 11.933F, 1.0F, 11.312F)
          verticalLineTo(4.686F)
          curveToRelative(0.0F, -0.62F, 0.382F, -1.177F, 0.962F, -1.4F)
          lineToRelative(4.961F, -1.908F)
          close()
          moveTo(4.697F, 5.04F)
          curveTo(4.443F, 4.93F, 4.149F, 5.048F, 4.04F, 5.302F)
          curveTo(3.932F, 5.556F, 4.05F, 5.85F, 4.303F, 5.96F)
          lineTo(7.5F, 7.329F)
          verticalLineToRelative(3.17F)
          curveTo(7.5F, 10.775F, 7.724F, 11.0F, 8.0F, 11.0F)
          reflectiveCurveToRelative(0.5F, -0.224F, 0.5F, -0.5F)
          verticalLineTo(7.33F)
          lineToRelative(3.197F, -1.37F)
          curveToRelative(0.254F, -0.11F, 0.371F, -0.403F, 0.263F, -0.657F)
          curveToRelative(-0.11F, -0.254F, -0.403F, -0.371F, -0.657F, -0.262F)
          lineTo(8.0F, 6.455F)
          lineTo(4.697F, 5.04F)
          close()        
      }
    }
    return _cube16!!
  }

private var _cube16: ImageVector? = null
