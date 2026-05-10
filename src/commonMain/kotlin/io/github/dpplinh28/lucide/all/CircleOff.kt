package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.35f, 2.69f)
                arcTo(10f, 10f, 0f, false, true, 21.3f, 15.65f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.08f, 19.08f)
                arcTo(10f, 10f, 0f, true, true, 4.92f, 4.92f)
            }
}

public val LucideIcons.All.CircleOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleOff: ImageVector
    @Composable get() = CircleOffDefinition.asImageVector()
