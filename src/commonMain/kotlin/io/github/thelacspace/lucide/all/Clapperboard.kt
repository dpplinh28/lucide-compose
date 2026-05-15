package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Clapperboard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12.296f, 3.464f)
                lineToRelative(3.02f, 3.956f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.2f, 6f)
                lineTo(3f, 11f)
                lineToRelative(-.9f, -2.4f)
                curveToRelative(-.3f, -1.1f, .3f, -2.2f, 1.3f, -2.5f)
                lineToRelative(13.5f, -4f)
                curveToRelative(1.1f, -.3f, 2.2f, .3f, 2.5f, 1.3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.18f, 5.276f)
                lineToRelative(3.1f, 3.899f)
            }
}

public val LucideIcons.All.ClapperboardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Clapperboard: ImageVector
    @Composable get() = ClapperboardDefinition.asImageVector()
