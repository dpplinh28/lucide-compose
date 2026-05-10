package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hammer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 12f)
                lineToRelative(-9.373f, 9.373f)
                arcToRelative(1f, 1f, 0f, false, true, -3.001f, -3f)
                lineTo(12f, 9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 15f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21.5f, 11.5f)
                lineToRelative(-1.914f, -1.914f)
                arcTo(2f, 2f, 0f, false, true, 19f, 8.172f)
                verticalLineToRelative(-.344f)
                arcToRelative(2f, 2f, 0f, false, false, -.586f, -1.414f)
                lineToRelative(-1.657f, -1.657f)
                arcTo(6f, 6f, 0f, false, false, 12.516f, 3f)
                horizontalLineTo(9f)
                lineToRelative(1.243f, 1.243f)
                arcTo(6f, 6f, 0f, false, true, 12f, 8.485f)
                verticalLineTo(10f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(1.172f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineTo(18.5f, 14.5f)
            }
}

public val LucideIcons.All.HammerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hammer: ImageVector
    @Composable get() = HammerDefinition.asImageVector()
