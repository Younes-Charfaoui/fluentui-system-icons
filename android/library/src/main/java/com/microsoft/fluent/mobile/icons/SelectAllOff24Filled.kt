package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SelectAllOff24: ImageVector
  get() {
    if (_selectAllOff24 != null) {
      return _selectAllOff24!!
    }
    _selectAllOff24 = fluentIcon(name = "Filled.SelectAllOff24", 24f) {
      materialPath {
          moveTo(6.25F, 3.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(9.5F)
          curveTo(3.0F, 17.545F, 4.455F, 19.0F, 6.25F, 19.0F)
          horizontalLineToRelative(9.5F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-9.5F)
          curveTo(19.0F, 4.455F, 17.545F, 3.0F, 15.75F, 3.0F)
          horizontalLineToRelative(-9.5F)
          close()
          moveToRelative(2.991F, 18.5F)
          curveToRelative(-1.151F, 0.0F, -2.163F, -0.598F, -2.741F, -1.501F)
          horizontalLineToRelative(9.746F)
          curveToRelative(2.073F, 0.0F, 3.753F, -1.68F, 3.753F, -3.753F)
          verticalLineTo(6.5F)
          curveTo(20.902F, 7.078F, 21.5F, 8.09F, 21.5F, 9.241F)
          verticalLineToRelative(7.005F)
          curveToRelative(0.0F, 2.902F, -2.352F, 5.254F, -5.254F, 5.254F)
          horizontalLineTo(9.241F)
          close()        
      }
    }
    return _selectAllOff24!!
  }

private var _selectAllOff24: ImageVector? = null
