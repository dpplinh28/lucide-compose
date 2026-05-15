package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacTaurus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 3f)
                arcTo(6f, 6f, 0f, false, true, 6f, 3f)
            }
}

public val LucideIcons.All.ZodiacTaurusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacTaurus: ImageVector
    @Composable get() = ZodiacTaurusDefinition.asImageVector()
