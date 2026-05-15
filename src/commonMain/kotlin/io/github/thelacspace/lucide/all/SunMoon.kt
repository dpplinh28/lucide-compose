package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SunMoon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.837f, 16.385f)
                arcToRelative(6f, 6f, 0f, true, true, -7.223f, -7.222f)
                curveToRelative(.624f, -.147f, .97f, .66f, .715f, 1.248f)
                arcToRelative(4f, 4f, 0f, false, false, 5.26f, 5.259f)
                curveToRelative(.589f, -.255f, 1.396f, .09f, 1.248f, .715f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 5f)
                lineToRelative(-1.256f, 1.256f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.SunMoonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SunMoon: ImageVector
    @Composable get() = SunMoonDefinition.asImageVector()
