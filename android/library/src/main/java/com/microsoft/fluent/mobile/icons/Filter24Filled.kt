package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.Filter24: ImageVector
  get() {
    if (_filter24 != null) {
      return _filter24!!
    }
    _filter24 = fluentIcon(name = "Filled.Filter24", 24f) {
      materialPath {
          moveTo(10.0F, 16.0F)
          horizontalLineToRelative(4.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          curveToRelative(0.0F, 0.513F, -0.386F, 0.936F, -0.883F, 0.993F)
          lineTo(14.0F, 18.0F)
          horizontalLineToRelative(-4.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          curveToRelative(0.0F, -0.513F, 0.386F, -0.936F, 0.883F, -0.993F)
          lineTo(10.0F, 16.0F)
          horizontalLineToRelative(4.0F)
          close()
          moveToRelative(-2.0F, -5.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          curveToRelative(0.0F, 0.513F, -0.386F, 0.935F, -0.883F, 0.993F)
          lineTo(16.0F, 13.0F)
          horizontalLineTo(8.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          curveToRelative(0.0F, -0.513F, 0.386F, -0.935F, 0.883F, -0.993F)
          lineTo(8.0F, 11.0F)
          horizontalLineToRelative(8.0F)
          close()
          moveTo(5.0F, 6.0F)
          horizontalLineToRelative(14.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          curveToRelative(0.0F, 0.513F, -0.386F, 0.936F, -0.883F, 0.993F)
          lineTo(19.0F, 8.0F)
          horizontalLineTo(5.0F)
          curveTo(4.448F, 8.0F, 4.0F, 7.552F, 4.0F, 7.0F)
          curveToRelative(0.0F, -0.513F, 0.386F, -0.936F, 0.883F, -0.993F)
          lineTo(5.0F, 6.0F)
          horizontalLineToRelative(14.0F)
          horizontalLineTo(5.0F)
          close()        
      }
    }
    return _filter24!!
  }

private var _filter24: ImageVector? = null
