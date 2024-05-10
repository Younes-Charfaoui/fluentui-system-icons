package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SelectAllOn24: ImageVector
  get() {
    if (_selectAllOn24 != null) {
      return _selectAllOn24!!
    }
    _selectAllOn24 = fluentIcon(name = "Filled.SelectAllOn24", 24f) {
      materialPath {
          moveTo(3.0F, 6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(9.5F)
          curveTo(17.545F, 3.0F, 19.0F, 4.455F, 19.0F, 6.25F)
          verticalLineToRelative(9.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineToRelative(-9.5F)
          curveTo(4.455F, 19.0F, 3.0F, 17.545F, 3.0F, 15.75F)
          verticalLineToRelative(-9.5F)
          close()
          moveToRelative(12.28F, 2.78F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          lineTo(10.0F, 12.19F)
          lineToRelative(-1.97F, -1.97F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(2.5F, 2.5F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(4.75F, -4.75F)
          close()
          moveTo(6.5F, 20.0F)
          curveToRelative(0.578F, 0.902F, 1.59F, 1.5F, 2.741F, 1.5F)
          horizontalLineToRelative(7.005F)
          curveToRelative(2.902F, 0.0F, 5.254F, -2.352F, 5.254F, -5.254F)
          verticalLineTo(9.241F)
          curveToRelative(0.0F, -1.151F, -0.598F, -2.163F, -1.501F, -2.741F)
          verticalLineToRelative(9.746F)
          curveToRelative(0.0F, 2.073F, -1.68F, 3.753F, -3.753F, 3.753F)
          horizontalLineTo(6.5F)
          close()        
      }
    }
    return _selectAllOn24!!
  }

private var _selectAllOn24: ImageVector? = null
