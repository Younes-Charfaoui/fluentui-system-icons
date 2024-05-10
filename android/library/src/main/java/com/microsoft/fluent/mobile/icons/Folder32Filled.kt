package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Folder32: ImageVector
  get() {
    if (_folder32 != null) {
      return _folder32!!
    }
    _folder32 = fluentIcon(name = "Filled.Folder32", 32f) {
      materialPath {
          moveTo(2.0F, 8.5F)
          curveTo(2.0F, 6.015F, 4.015F, 4.0F, 6.5F, 4.0F)
          horizontalLineToRelative(3.964F)
          curveToRelative(0.929F, 0.0F, 1.819F, 0.369F, 2.475F, 1.025F)
          lineTo(15.0F, 7.085F)
          lineToRelative(-3.475F, 3.476F)
          curveTo(11.244F, 10.842F, 10.862F, 11.0F, 10.465F, 11.0F)
          horizontalLineTo(2.0F)
          verticalLineTo(8.5F)
          close()
          moveTo(2.0F, 13.0F)
          verticalLineToRelative(10.5F)
          curveTo(2.0F, 25.985F, 4.015F, 28.0F, 6.5F, 28.0F)
          horizontalLineToRelative(19.0F)
          curveToRelative(2.485F, 0.0F, 4.5F, -2.015F, 4.5F, -4.5F)
          verticalLineTo(12.0F)
          curveToRelative(0.0F, -2.485F, -2.015F, -4.5F, -4.5F, -4.5F)
          horizontalLineToRelative(-8.086F)
          lineToRelative(-4.475F, 4.475F)
          curveTo(12.283F, 12.63F, 11.393F, 13.0F, 10.464F, 13.0F)
          horizontalLineTo(2.0F)
          close()        
      }
    }
    return _folder32!!
  }

private var _folder32: ImageVector? = null
