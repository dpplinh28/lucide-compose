package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PersonStanding") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 20f)
                lineToRelative(3f, -6f)
                lineToRelative(3f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 8f)
                lineToRelative(6f, 2f)
                lineToRelative(6f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.PersonStandingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PersonStanding: ImageVector
    @Composable get() = PersonStandingDefinition.asImageVector()
