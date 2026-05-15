package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scooter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 4f)
                horizontalLineToRelative(-3.5f)
                lineToRelative(2f, 11.05f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.95f, 17f)
                horizontalLineToRelative(5.142f)
                curveToRelative(.523f, 0f, .95f, -.406f, 1.063f, -.916f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 5.345f, -5.009f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f, 17.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5.0f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 17.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5.0f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5.0f, 0f)
            }
}

public val LucideIcons.All.ScooterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scooter: ImageVector
    @Composable get() = ScooterDefinition.asImageVector()
