package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Earth") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.54f, 15f)
                horizontalLineTo(17f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4.54f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3.34f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                curveToRelative(0f, 1.1f, .9f, 2f, 2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                curveToRelative(0f, -1.1f, .9f, -2f, 2f, -2f)
                horizontalLineToRelative(3.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 21.95f)
                verticalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(2.05f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
}

public val LucideIcons.All.EarthDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Earth: ImageVector
    @Composable get() = EarthDefinition.asImageVector()
