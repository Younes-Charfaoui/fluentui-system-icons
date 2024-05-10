package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowThree20: ImageVector
  get() {
    if (_layoutRowThree20 != null) {
      return _layoutRowThree20!!
    }
    _layoutRowThree20 = fluentIcon(name = "Filled.LayoutRowThree20", 20f) {
      materialPath {
          moveTo(17.0F, 7.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(14.0F)
          close()
          moveTo(3.0F, 8.0F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(14.0F)
          verticalLineTo(8.0F)
          horizontalLineTo(3.0F)
          close()
          moveToRelative(0.0F, 6.0F)
          verticalLineToRelative(-1.0F)
          horizontalLineToRelative(14.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          close()        
      }
    }
    return _layoutRowThree20!!
  }

private var _layoutRowThree20: ImageVector? = null
