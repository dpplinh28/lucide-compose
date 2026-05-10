package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pyramid") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.5f, 16.88f)
                arcToRelative(1f, 1f, 0f, false, true, -.32f, -1.43f)
                lineToRelative(9f, -13.02f)
                arcToRelative(1f, 1f, 0f, false, true, 1.64f, 0f)
                lineToRelative(9f, 13.01f)
                arcToRelative(1f, 1f, 0f, false, true, -.32f, 1.44f)
                lineToRelative(-8.51f, 4.86f)
                arcToRelative(2f, 2f, 0f, false, true, -1.98f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(20f)
            }
}

public val LucideIcons.All.PyramidDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pyramid: ImageVector
    @Composable get() = PyramidDefinition.asImageVector()
