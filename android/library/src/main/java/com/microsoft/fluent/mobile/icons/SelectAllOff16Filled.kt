package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SelectAllOff16: ImageVector
  get() {
    if (_selectAllOff16 != null) {
      return _selectAllOff16!!
    }
    _selectAllOff16 = fluentIcon(name = "Filled.SelectAllOff16", 16f) {
      materialPath {
          moveTo(2.0F, 4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(5.0F)
          curveTo(10.88F, 2.0F, 12.0F, 3.12F, 12.0F, 4.5F)
          verticalLineToRelative(5.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(3.12F, 12.0F, 2.0F, 10.88F, 2.0F, 9.5F)
          verticalLineToRelative(-5.0F)
          close()
          moveTo(7.0F, 14.0F)
          curveToRelative(-0.818F, 0.0F, -1.544F, -0.393F, -2.0F, -1.0F)
          horizontalLineToRelative(4.5F)
          curveToRelative(1.933F, 0.0F, 3.5F, -1.567F, 3.5F, -3.5F)
          verticalLineTo(4.0F)
          curveToRelative(0.607F, 0.456F, 1.0F, 1.182F, 1.0F, 2.0F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 2.485F, -2.014F, 4.5F, -4.5F, 4.5F)
          horizontalLineTo(7.0F)
          close()        
      }
    }
    return _selectAllOff16!!
  }

private var _selectAllOff16: ImageVector? = null
