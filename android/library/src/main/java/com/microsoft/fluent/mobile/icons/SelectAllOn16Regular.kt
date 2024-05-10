package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.SelectAllOn16: ImageVector
  get() {
    if (_selectAllOn16 != null) {
      return _selectAllOn16!!
    }
    _selectAllOn16 = fluentIcon(name = "Regular.SelectAllOn16", 16f) {
      materialPath {
          moveTo(9.854F, 5.854F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.707F, 0.0F)
          lineTo(6.5F, 7.793F)
          lineTo(5.354F, 6.646F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineToRelative(1.5F, 1.5F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineToRelative(3.0F, -3.0F)
          close()
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
          moveTo(4.5F, 3.0F)
          curveTo(3.672F, 3.0F, 3.0F, 3.672F, 3.0F, 4.5F)
          verticalLineToRelative(5.0F)
          curveTo(3.0F, 10.328F, 3.672F, 11.0F, 4.5F, 11.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-5.0F)
          curveTo(11.0F, 3.672F, 10.328F, 3.0F, 9.5F, 3.0F)
          horizontalLineToRelative(-5.0F)
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
    return _selectAllOn16!!
  }

private var _selectAllOn16: ImageVector? = null
