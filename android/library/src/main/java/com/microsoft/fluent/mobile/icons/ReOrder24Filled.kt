package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ReOrder24: ImageVector
  get() {
    if (_reOrder24 != null) {
      return _reOrder24!!
    }
    _reOrder24 = fluentIcon(name = "Filled.ReOrder24", 24f) {
      materialPath {
          moveTo(3.0F, 13.0F)
          horizontalLineToRelative(18.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          curveToRelative(0.0F, 0.513F, -0.386F, 0.935F, -0.883F, 0.993F)
          lineTo(21.0F, 15.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          curveToRelative(0.0F, -0.513F, 0.386F, -0.935F, 0.883F, -0.993F)
          lineTo(3.0F, 13.0F)
          horizontalLineToRelative(18.0F)
          horizontalLineTo(3.0F)
          close()
          moveToRelative(0.0F, -4.0F)
          horizontalLineToRelative(18.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          curveToRelative(0.0F, 0.513F, -0.386F, 0.935F, -0.883F, 0.993F)
          lineTo(21.0F, 11.0F)
          horizontalLineTo(3.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          curveToRelative(0.0F, -0.513F, 0.386F, -0.935F, 0.883F, -0.993F)
          lineTo(3.0F, 9.0F)
          horizontalLineToRelative(18.0F)
          horizontalLineTo(3.0F)
          close()        
      }
    }
    return _reOrder24!!
  }

private var _reOrder24: ImageVector? = null
