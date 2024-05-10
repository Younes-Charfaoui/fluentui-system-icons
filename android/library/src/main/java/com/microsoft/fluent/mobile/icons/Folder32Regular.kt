package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Folder32: ImageVector
  get() {
    if (_folder32 != null) {
      return _folder32!!
    }
    _folder32 = fluentIcon(name = "Regular.Folder32", 32f) {
      materialPath {
          moveTo(4.0F, 8.5F)
          verticalLineTo(11.0F)
          horizontalLineToRelative(6.464F)
          curveToRelative(0.398F, 0.0F, 0.78F, -0.158F, 1.061F, -0.44F)
          lineToRelative(2.06F, -2.06F)
          lineToRelative(-2.06F, -2.06F)
          curveTo(11.244F, 6.157F, 10.862F, 6.0F, 10.465F, 6.0F)
          horizontalLineTo(6.5F)
          curveTo(5.12F, 6.0F, 4.0F, 7.12F, 4.0F, 8.5F)
          close()
          moveToRelative(-2.0F, 0.0F)
          curveTo(2.0F, 6.015F, 4.015F, 4.0F, 6.5F, 4.0F)
          horizontalLineToRelative(3.964F)
          curveToRelative(0.929F, 0.0F, 1.819F, 0.369F, 2.475F, 1.025F)
          lineTo(15.414F, 7.5F)
          horizontalLineTo(25.5F)
          curveToRelative(2.485F, 0.0F, 4.5F, 2.015F, 4.5F, 4.5F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 2.485F, -2.015F, 4.5F, -4.5F, 4.5F)
          horizontalLineToRelative(-19.0F)
          curveTo(4.015F, 28.0F, 2.0F, 25.985F, 2.0F, 23.5F)
          verticalLineToRelative(-15.0F)
          close()
          moveTo(4.0F, 13.0F)
          verticalLineToRelative(10.5F)
          curveTo(4.0F, 24.88F, 5.12F, 26.0F, 6.5F, 26.0F)
          horizontalLineToRelative(19.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineTo(12.0F)
          curveToRelative(0.0F, -1.38F, -1.12F, -2.5F, -2.5F, -2.5F)
          horizontalLineTo(15.414F)
          lineToRelative(-2.475F, 2.475F)
          curveTo(12.283F, 12.63F, 11.393F, 13.0F, 10.464F, 13.0F)
          horizontalLineTo(4.0F)
          close()        
      }
    }
    return _folder32!!
  }

private var _folder32: ImageVector? = null
