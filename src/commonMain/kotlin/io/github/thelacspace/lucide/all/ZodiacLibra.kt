package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacLibra") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 16f)
                horizontalLineToRelative(6.857f)
                curveToRelative(.162f, -.012f, .19f, -.323f, .038f, -.38f)
                arcToRelative(6f, 6f, 0f, true, true, 4.212f, 0f)
                curveToRelative(-.153f, .057f, -.125f, .368f, .038f, .38f)
                horizontalLineTo(21f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 20f)
                horizontalLineToRelative(18f)
            }
}

public val LucideIcons.All.ZodiacLibraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacLibra: ImageVector
    @Composable get() = ZodiacLibraDefinition.asImageVector()
