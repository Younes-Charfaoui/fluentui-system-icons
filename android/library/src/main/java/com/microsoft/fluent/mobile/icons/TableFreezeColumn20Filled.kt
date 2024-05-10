package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TableFreezeColumn20: ImageVector
  get() {
    if (_tableFreezeColumn20 != null) {
      return _tableFreezeColumn20!!
    }
    _tableFreezeColumn20 = fluentIcon(name = "Filled.TableFreezeColumn20", 20f) {
      materialPath {
          moveTo(4.0F, 5.5F)
          curveTo(4.0F, 4.672F, 4.672F, 4.0F, 5.5F, 4.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(3.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(3.0F)
          horizontalLineTo(5.5F)
          curveTo(4.12F, 3.0F, 3.0F, 4.12F, 3.0F, 5.5F)
          verticalLineToRelative(9.0F)
          curveTo(3.0F, 15.88F, 4.12F, 17.0F, 5.5F, 17.0F)
          horizontalLineTo(12.0F)
          verticalLineToRelative(-4.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(3.0F)
          horizontalLineTo(5.5F)
          curveTo(4.672F, 16.0F, 4.0F, 15.328F, 4.0F, 14.5F)
          verticalLineToRelative(-9.0F)
          close()
          moveTo(14.5F, 17.0F)
          horizontalLineTo(13.0F)
          verticalLineToRelative(-4.0F)
          horizontalLineToRelative(4.0F)
          verticalLineToRelative(1.5F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          close()
          moveTo(13.0F, 8.0F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(8.0F)
          horizontalLineToRelative(-4.0F)
          close()
          moveToRelative(-5.0F, 4.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(8.0F)
          horizontalLineTo(8.0F)
          verticalLineToRelative(4.0F)
          close()
          moveToRelative(9.0F, -5.0F)
          horizontalLineToRelative(-4.0F)
          verticalLineTo(3.0F)
          horizontalLineToRelative(1.5F)
          curveTo(15.88F, 3.0F, 17.0F, 4.12F, 17.0F, 5.5F)
          verticalLineTo(7.0F)
          close()        
      }
    }
    return _tableFreezeColumn20!!
  }

private var _tableFreezeColumn20: ImageVector? = null
