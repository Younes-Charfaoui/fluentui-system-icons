package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowTwo20: ImageVector
  get() {
    if (_layoutRowTwo20 != null) {
      return _layoutRowTwo20!!
    }
    _layoutRowTwo20 = fluentIcon(name = "Filled.LayoutRowTwo20", 20f) {
      materialPath {
          moveTo(3.0F, 6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(3.5F)
          horizontalLineTo(3.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(0.0F, 4.5F)
          verticalLineTo(14.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineToRelative(-3.5F)
          horizontalLineTo(3.0F)
          close()        
      }
    }
    return _layoutRowTwo20!!
  }

private var _layoutRowTwo20: ImageVector? = null
