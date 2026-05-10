package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Section") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                arcToRelative(4f, 3f, 0f, false, false, -8f, 0f)
                curveToRelative(0f, 4f, 8f, 3f, 8f, 7f)
                arcToRelative(4f, 3f, 0f, false, true, -8f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 19f)
                arcToRelative(4f, 3f, 0f, false, false, 8f, 0f)
                curveToRelative(0f, -4f, -8f, -3f, -8f, -7f)
                arcToRelative(4f, 3f, 0f, false, true, 8f, 0f)
            }
}

public val LucideIcons.All.SectionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Section: ImageVector
    @Composable get() = SectionDefinition.asImageVector()
